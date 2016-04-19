// initialize swagger client, point to a resource listing
window.client = new SwaggerClient({
    url: "http://localhost:8080/api-docs",
    success: function() {
        // upon connect, fetch a pet and set contents to element "mydata"
        client.Stack.getStack({}, {responseContentType: 'application/json'}, function(data) {
            document.getElementById("mydata").innerHTML = JSON.stringify(data.obj);
        });
    }
});
