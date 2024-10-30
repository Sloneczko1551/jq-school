$(function(){
        $('#1').on('click', function(){
            alert('szedł zbój');

        });
        $('button').on('click', function(){
            $('#2').css({
                'display': 'none',
            })
            $('#4').css({
                'background-color': 'green',
            });
            $('#5').css({
                'font-family': 'cursive',
                'background-color': 'purple',
            });
        });
        $('#3').css({
            'background-color': 'yellow',
        });
        $('#6').on('mouseover', function(){
            $('#6').css({
                'color': 'green',
            });
        });
        $('#7').on('mouseout', function(){
            $('#7').css({
                'color': 'yellow',
            });
        });
        $('#z1').on('mouseover', function(){
            $('#x1').css({
                'display': 'block',
            });
        });
        $('#z1').on('mouseout', function(){
            $('#x1').css({
                'display': 'none',
            });
        });
});