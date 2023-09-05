package ch11.part01.main7;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class MainView extends JFrame {

    /** 전역변수 name */
    private String name ;

    public MainView(String name){

        /** 객체 생성 시 name 값을 받아와 전역변수 name에 담는다. */
        this.name = name;

        /** 배치를 수동(위치와 크기)으로 입력 */
        this.setLayout(null);

        /** 화면 크기 설정 */
        this.setSize(300, 200);

        /** 텍스트 컴포넌트 생성 */
        JTextField textField = new JTextField();
        textField.setBounds(10, 10, 100, 30);
        this.add(textField);

        /** 버튼 생성 */
        JButton btn = new JButton("저장");
        btn.setBounds(120, 10, 100, 30);
        this.add(btn);

        /** 버튼 이벤트 생성 */
        btn.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 /** 버튼 클릭 시 내부 로직이 실행됨 */

                 //【문제】 버튼 클릭 시 전역변수 name의 변수 값을 textField에 나타내시오.
                 // ex) 표기방법: textField.setText("보일 값을 입력");

             }
        });
    }

    public static void main(String[] args) {
        MainView mainView = new MainView("테스트");
        mainView.setVisible(true);
    }
}