public class Rectangle {
private int cd;
private int cr;
public Rectangle() {
	int n=cd=cr;
}
public Rectangle (int cd,int cr) {
	this.cd = cd;
	this.cr = cr;
}
public int getCd() {
	return cd;
}
public void setCd(int cd) {
	this.cd = cd;
}
public int getCr() {
	return cr;
}
public void setCr(int cr) {
	this.cr = cr;
}
int Chuvi() {
	return (cd+cr)/2;
}
int Dientich() {
	return cd*cr;
}
}