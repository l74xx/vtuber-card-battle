public class Main {
    public static void main(String[] args) {
        System.out.println("=== VTuber Card Battle v1.0 ===");
	System.out.println("歡迎來到配信宇宙錦標賽！");

        // 測試 VTuber 卡
        VTuberCard earendel = new VTuberCard("厄倫蒂兒", 5, "DEEP_SPACE", 4, 6);
        System.out.println(earendel.display());

        // 測試才藝卡
        TalentCard heal = new TalentCard("歌回直播", 3, "DEEP_SPACE", "HEAL", 5);
        System.out.println(heal.display());
    }
}
