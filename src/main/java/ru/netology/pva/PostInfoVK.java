package ru.netology.pva;

public class PostInfoVK {
    private boolean avatar;         // аватар владельца поста
    private  int owner;             // наименование владельца поста
    private  int date;              // дата размещения поста
    private String postDescription; // текст поста
    private boolean imageVideo;     // наличие видео или фото к посту
    private int likePost;           // количество лайков
    private int repost;             // количество репостов
    private int lookedPost;         // количество просмотров поста
    private int replyOwnerId;     //идентификатор владельца записи, в ответ на которую была оставлена текущая.
    private int replyPostId;      //идентификатор записи, в ответ на которую была оставлена текущая

    // наверное я бы тут установил boolean так как понятие или для друзей или для всех
    // boolean принимает значение: 0- доступно друзьям , 1 - доступно всем
    private int friendsOnly;       //запись была создана с опцией «Только для друзей».


}
