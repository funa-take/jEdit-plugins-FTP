package ftp;

public class Util {
	public static int getPort(String host, int defaultValue) {
		int index = getPortIndex(host);
		if (index == -1) {
			return defaultValue;
		}
		
		try {
			return Integer.parseInt(host.substring(index + 1));
		} catch(NumberFormatException e) {
			return defaultValue;
		}

	}
	
	public static int getPortIndex(String host) {
		if (host.startsWith("[")) {
			if (host.indexOf("]:") >= 0) {
				return host.lastIndexOf(":");
			}
		} else {
			return host.lastIndexOf(":");
		}
		return -1;
	}
}
