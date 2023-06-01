//public enum Company {
//    SK("에스케이"),
//    LG("엘쥐"),
//    KT("케이티"),
//    SAMSUNG("삼성"),
//    APPLE("애플");
//
//    private final String value;
//
//    Company(String value){
//        this.value = value;
//    }
//
//    public String getValue(){
//        return value;
//    }
//}


public enum Company{
    SK("에스케이"), //상수~값
    KT("엘쥐"),
    LG("케이티"),
    SAMSUNG("삼성"),
    APPLE("애플");

    private final String value;
    Company(String value){ //enum 생성자 규칙 : private 생략
        this.value = value;
    }
    public String getValue(){
        return value;
    }

}

