package io.github.nma.utils.aws;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.auth.profile.ProfileCredentialsProvider;
import com.amazonaws.regions.Region;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3Client;
import com.amazonaws.services.s3.model.AmazonS3Exception;
import com.amazonaws.services.s3.model.BucketVersioningConfiguration;
import com.amazonaws.services.s3.model.ListVersionsRequest;
import com.amazonaws.services.s3.model.S3VersionSummary;
import com.amazonaws.services.s3.model.SetBucketVersioningConfigurationRequest;
import com.amazonaws.services.s3.model.VersionListing;

/**
 * Utility for communicating with S3 buckets.
 *
 * Created by nickma on 2016-04-09
 */
public class S3BucketController {

    private static AmazonS3Client s3Client;

    public S3BucketController(AWSCredentialsProvider provider) {
        this.s3Client = new AmazonS3Client(provider);
    }

    public void createNewBucket() {

    }

    public void enableVersioningOnBucket(String bucketName) {
        s3Client = new AmazonS3Client(new ProfileCredentialsProvider());
        s3Client.setRegion(Region.getRegion(Regions.US_EAST_1));
        try {

            // 1. Enable versioning on the bucket.
            BucketVersioningConfiguration configuration =
                    new BucketVersioningConfiguration().withStatus("Enabled");

            SetBucketVersioningConfigurationRequest setBucketVersioningConfigurationRequest =
                    new SetBucketVersioningConfigurationRequest(bucketName,configuration);

            s3Client.setBucketVersioningConfiguration(setBucketVersioningConfigurationRequest);

            // 2. Get bucket versioning configuration information.
            BucketVersioningConfiguration conf = s3Client.getBucketVersioningConfiguration(bucketName);
            System.out.println("bucket versioning configuration status:    " + conf.getStatus());

        } catch (AmazonS3Exception amazonS3Exception) {
            System.out.format("An Amazon S3 error occurred. Exception: %s", amazonS3Exception.toString());
        } catch (Exception ex) {
            System.out.format("Exception: %s", ex.toString());
        }
    }

    public void listVersioningEnabledBucket(String bucketName) {
        AmazonS3 s3client = new AmazonS3Client(new ProfileCredentialsProvider());
        try {
            System.out.println("Listing objects");

            ListVersionsRequest request = new ListVersionsRequest()
                    .withBucketName(bucketName)
                    .withMaxResults(2);
            // you can specify .withPrefix to obtain version list for a specific object or objects with
            // the specified key prefix.

            VersionListing versionListing;
            do {
                versionListing = s3client.listVersions(request);
                for (S3VersionSummary objectSummary :
                        versionListing.getVersionSummaries()) {
                    System.out.println(" - " + objectSummary.getKey() + "  " +
                            "(size = " + objectSummary.getSize() + ")" +
                            "(versionID= " + objectSummary.getVersionId() + ")");

                }
                request.setKeyMarker(versionListing.getNextKeyMarker());
                request.setVersionIdMarker(versionListing.getNextVersionIdMarker());
            } while (versionListing.isTruncated());
        } catch (AmazonServiceException ase) {
            System.out.println("Caught an AmazonServiceException, " +
                    "which means your request made it " +
                    "to Amazon S3, but was rejected with an error response " +
                    "for some reason.");
            System.out.println("Error Message:    " + ase.getMessage());
            System.out.println("HTTP Status Code: " + ase.getStatusCode());
            System.out.println("AWS Error Code:   " + ase.getErrorCode());
            System.out.println("Error Type:       " + ase.getErrorType());
            System.out.println("Request ID:       " + ase.getRequestId());
        } catch (AmazonClientException ace) {
            System.out.println("Caught an AmazonClientException, " +
                    "which means the client encountered " +
                    "an internal error while trying to communicate" +
                    " with S3, " +
                    "such as not being able to access the network.");
            System.out.println("Error Message: " + ace.getMessage());
        }
    }
}
