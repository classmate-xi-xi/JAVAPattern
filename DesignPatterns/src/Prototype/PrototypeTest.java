package Prototype;

import java.io.*;


class SerializableObject implements Serializable {
    private static final long serialVersionUID = 1L;
}

public class PrototypeTest implements Cloneable,Serializable {
    private static final long serialVersionUID = 1L;
    private String string;
    private SerializableObject object;

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public SerializableObject getObj() {
        return object;
    }

    public void setObj(SerializableObject object) {
        this.object = object;
    }

    //浅拷贝
    static class Body implements Cloneable{
        public Head head;
        public Body() {}
        public Body(Head head) {this.head = head;}

        @Override
        protected Object clone() throws CloneNotSupportedException {
            Body newBody =  (Body) super.clone();
            newBody.head = (Head) head.clone();
            return newBody;
        }

    }
    public Object clone() throws CloneNotSupportedException{
        PrototypeTest prototypeTest = (PrototypeTest) super.clone();
        return prototypeTest;
    }
    //深拷贝
    static class Head implements Cloneable{
        public  Face face;

        public Head() {}
        public Head(Face face){this.face = face;}
        @Override
        protected Object clone() throws CloneNotSupportedException {
            //return super.clone();
            Head newHead = (Head) super.clone();
            newHead.face = (Face) this.face.clone();
            return newHead;
        }
    }

    static class Face implements Cloneable{
        @Override
        protected Object clone() throws CloneNotSupportedException {
            return super.clone();
        }
    }
    public static void main(String[] args) throws CloneNotSupportedException {
        PrototypeTest p = new PrototypeTest();
        PrototypeTest p1 =(PrototypeTest) p.clone();
        System.out.println(p.equals(p1));

        Body body = new Body(new Head(new Face()));

        Body body1 = (Body) body.clone();

        System.out.println("body == body1 : " + (body == body1) );

        System.out.println("body.head == body1.head : " +  (body.head == body1.head));

        System.out.println("body.head.face == body1.head.face : " +  (body.head.face == body1.head.face));
    }
}

