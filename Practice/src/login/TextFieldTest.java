package login;
import java.awt.*;

 

class TextFieldTest{

       public static void main(String args[]){

             Frame f = new Frame("Login");

             f.setSize(400,65);

             //LayoutManager를 FlowLayout으로 한다.

             f.setLayout(new FlowLayout());

            

             //정렬을 오른쪽으로

             Label lid = new Label("ID :", Label.RIGHT);

             Label lpwd = new Label("Password :", Label.RIGHT);

            

             //약 10개의 글자를 입력할 수 있는 TextField 생성

             TextField id = new TextField(10);

             TextField pwd = new TextField(10);

             //입력한 값 대신 '*'가 보이도록 한다.

             pwd.setEchoChar('*');

            

             //생성한 컴포넌트들을 Frame에 포함시킨다.

             f.add(lid);

             f.add(id);

             f.add(lpwd);

             f.add(pwd);

             f.setVisible(true);

       }

}