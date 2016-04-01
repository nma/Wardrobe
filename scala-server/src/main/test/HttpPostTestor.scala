/**
 * Created by nickma on 2016-04-01.
 */
import java.io._
import org.apache.commons._
import org.apache.http._
import org.apache.http.client._
import org.apache.http.client.methods.HttpPost
import org.apache.http.impl.client.DefaultHttpClient
import java.util.ArrayList
import org.apache.http.message.BasicNameValuePair
import org.apache.http.client.entity.UrlEncodedFormEntity

/**
 * This is a Scala HTTP POST client. I created it to test my Scalatra POST server side method.
 */
object HttpPostTester {

  def main(args: Array[String]) {

  val url = "http://localhost:8080/api/comments";
    val client = new DefaultHttpClient

    // add header elements
    val post = new HttpPost(url)
//    post.addHeader("appid","YahooDemo")
//    post.addHeader("query","umbrella")
//    post.addHeader("results","10")

    // add name value pairs (works with "params" function on the server side)
    val nameValuePairs = new ArrayList[NameValuePair](1)
    nameValuePairs.add(new BasicNameValuePair("text", "123456789"));
    nameValuePairs.add(new BasicNameValuePair("author", "GOOGLE"));
    post.setEntity(new UrlEncodedFormEntity(nameValuePairs));

    // send the post request
    val response = client.execute(post)
    println("--- HEADERS ---")
    response.getAllHeaders.foreach(arg => println(arg))
  }
}