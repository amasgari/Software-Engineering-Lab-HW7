public class Square extends Rectangle {
    public Square(int side) {
        super(side, side);
    }

    public int GetSide(){
        return super.GetHeight();
    }
    
    public void SetSide(int side){
        super.SetHeight(side);
        super.SetWidth(side);
    }
}