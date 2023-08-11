package designPattern.structural.fascadeDesign;

public class FascadeImplementation {
	
	public static void main(String[] args) {
		OsFascade.getReport(OsType.Mac);
		
	}

}
class WindowsDownloader{
	public static String getWindowsImage() {
		return "Windows Image";
	}
	public void getWindowsPerformanceReport() {
		System.out.println("Windows Performance Report");
	}
}
class LinuxDownloader{
	public static String getLinuxImage() {
		return "Linux Image";
	}
	public void getLinuxPerformanceReport() {
		System.out.println("Linux Performance Report");
	}
}
class MacDownloader{
	public static String getMacImage() {
		return "Mac Image";
	}
	public void getMacPerformanceReport() {
		System.out.println("Mac Performance Report");
	}
}
enum OsType{
	Windows,
	Mac,
	Linux
}
class OsFascade{
	public static void getReport(OsType osType){
		switch(osType) {
		case Windows: 
			WindowsDownloader windowsDownloader=new WindowsDownloader();
			windowsDownloader.getWindowsPerformanceReport();
			break;
		case Mac:
			MacDownloader macDownloader=new MacDownloader();
			macDownloader.getMacPerformanceReport();
			break;
		case Linux:
			LinuxDownloader linuxDownloader=new LinuxDownloader();
			linuxDownloader.getLinuxPerformanceReport();
			break;
		
		
		}
		
	}
}
