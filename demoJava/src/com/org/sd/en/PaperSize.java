package com.org.sd.en;
public enum PaperSize {
A0(841,1189),A1(594,841),
A2(420,594),A3( 297,420),
A4(210,297),A5(148,210),
A6(105,148),A7(74,105),A8(52,74);
int dim1,dim2;
public int getDim1() {
return dim1;
}
public void setDim1(int dim1) {
this.dim1 = dim1;
}
public int getDim2() {
return dim2;
}
public void setDim2(int dim2) {
this.dim2 = dim2;
}
PaperSize(int dim1,int dim2){
this.dim1=dim1;
this.dim2=dim2;
}

}
