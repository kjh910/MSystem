package command;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LinuxCommand {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String dir = LinuxCommand.setDir(System.getProperty("user.dir"));

		String[] command = { "/bin/bash" , "-c", dir + "implSpringBoot.sh " + args[0]};
		
		shellCmd(command);

	}

	public static String setDir(String dir) {
		try {
			Pattern ptn = Pattern.compile("(.*/)");
			Matcher matcher = ptn.matcher(dir);
			while (matcher.find()) {
				dir = matcher.group(1);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return dir;
	}

	public static void shellCmd(String[] command) throws Exception {
		Process process = new ProcessBuilder(command).start();
		InputStream is = process.getInputStream();
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		String line;
		while ((line = br.readLine()) != null) {
			System.out.println(line);
		}
	}
}
