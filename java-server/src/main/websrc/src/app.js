// initialize swagger client, point to a resource listing
window.client = new SwaggerClient({
    url: "http://localhost:8080/api-docs",
    success: function() {
        client.Stack.getStack({}, {responseContentType: 'application/json'}, function(data) {
            document.getElementById("mydata").innerHTML = JSON.stringify(data.obj);
        });
    }
});
