const http=require('http');

http.createServer(function(req,resp){
    resp.write('Hola Mundo');
    resp.write('Ingresa a este link: https://www.youtube.com/watch?v=G1IbRujko-A');
    resp.end();
}).listen(8080);
consoler.log('Server running');