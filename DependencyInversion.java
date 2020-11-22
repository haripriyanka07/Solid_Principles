package com.solidprinciples;

interface images{
    abstract void images();
}
class Select implements images {
    @Override
    public void images() {
        System.out.println("Selected image sent successfully");
    }
}
class SendImage{
    private images im;
    public SendImage(images im){
        this.im = im;
    }
    public void info(){
        im.images();
    }

}
public class DependencyInversion {
    public static void main(String[] args) {
        SendImage si = new SendImage(new Select());
        si.info();
    }
}
