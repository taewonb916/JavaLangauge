package login;
import java.awt.*;

 

class TextFieldTest{

       public static void main(String args[]){

             Frame f = new Frame("Login");

             f.setSize(400,65);

             //LayoutManager�� FlowLayout���� �Ѵ�.

             f.setLayout(new FlowLayout());

            

             //������ ����������

             Label lid = new Label("ID :", Label.RIGHT);

             Label lpwd = new Label("Password :", Label.RIGHT);

            

             //�� 10���� ���ڸ� �Է��� �� �ִ� TextField ����

             TextField id = new TextField(10);

             TextField pwd = new TextField(10);

             //�Է��� �� ��� '*'�� ���̵��� �Ѵ�.

             pwd.setEchoChar('*');

            

             //������ ������Ʈ���� Frame�� ���Խ�Ų��.

             f.add(lid);

             f.add(id);

             f.add(lpwd);

             f.add(pwd);

             f.setVisible(true);

       }

}