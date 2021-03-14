package com.example.threaddemo.buider;

public class ThatYearBuilder extends Builder {

    private ThatYearBean thatYearBean = new ThatYearBean();

    @Override
    public void buildYear() {

        thatYearBean.setYear("1084");
    }

    @Override
    public void buildMonthDay() {
        thatYearBean.setMonthDay("0313");
    }

    @Override
    public void buildTitle() {
        thatYearBean.setTitle("宋代女词人李清照出生");
    }

    @Override
    public void buildDesc() {
        thatYearBean.setDesc("李清照（1084年3月13日—1155年5月12日），号易安居士，汉族，齐州章丘（今山东章丘）人。宋代（两宋之交）女词人，婉约词派代");

    }

    @Override
    public void buildType() {
        thatYearBean.setDesc("birth");

    }

    @Override
    public ThatYearBean getResult() {
        return thatYearBean;
    }
}
