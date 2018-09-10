var stompClient= null;
$(function () {
    $('#connectbut').click(function(){
        $('#connectbut').hide();
        $('#name').hide();
        $('#chat').show();
        $('#send').show();
        $('#message').show();

    });
});


function setConnected(){
    var socket = new SocketJS('/ws');
    stompClient= Stomp.over(socket);
    
}

