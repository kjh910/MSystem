package program;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import command.LinuxCommand;

public class ShowWindow extends JFrame {

	JFrame Recruit = new JFrame();
	JPanel panel1 = new JPanel();
	JPanel panel2 = new JPanel();
	JPanel panel3 = new JPanel();
	JButton jb1 = new JButton("실행");
	JTextField tf = new JTextField(10);
	JLabel label1 = new JLabel("DB서버 IP를 입력하세요. 올바른 IP를 입력 후 10~20초 후에 브라우저를 열어주세요. ");
	JLabel label2 = new JLabel();

	private static final long serialVersionUID = 1L;

	public ShowWindow() {
		panel1.add(label1);

		jb1.addActionListener(new Listner());
		panel2.add(tf);
		panel2.add(jb1);
		panel3.add(label2);

		Recruit.getContentPane().add(BorderLayout.NORTH, panel1);
		Recruit.getContentPane().add(BorderLayout.CENTER, panel2);
		Recruit.getContentPane().add(BorderLayout.SOUTH, panel3);

		Recruit.setTitle("관리 프로그램 실행");
		Recruit.setSize(500, 110);
		Recruit.setResizable(false);
		Recruit.setLocationRelativeTo(null);
		Recruit.setVisible(true);
		Recruit.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//		if (label2.getText().equals("서버를 실행중입니다.")) {
//			
//		}
	}

	class Listner implements ActionListener {

		private LinuxCommand LinuxCommand;

		@SuppressWarnings("static-access")
		@Override
		public void actionPerformed(ActionEvent actionEvent) {
			String ipAddr = tf.getText();
			String[] ipAddrBox = {ipAddr};

			if (actionEvent.getSource() == jb1) {

				Pattern pattern = Pattern.compile(
						"^(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$");
				Matcher matcher = pattern.matcher(ipAddrBox[0]);

				if (matcher.find() || ipAddrBox[0].equals("localhost")) {
//					label2.setText("서버를 실행중입니다. 10초 정도 후에 브라우저에서 관리 프로그램을 실행해 주세요.");
					try {
						LinuxCommand.main(ipAddrBox);
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				} else {
					label2.setText("올바른 형식의 IP주소를 입력해 주세요.");
				}
			}
		}
	}

}
