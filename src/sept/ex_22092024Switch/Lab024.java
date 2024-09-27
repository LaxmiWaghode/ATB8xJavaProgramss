package sept.ex_22092024Switch;

public class Lab024 {
    public static void main(String[] args) {
        //String browser = "Chrome";
        String browser= "edge";
        switch (browser) {
            case "Chrome":
                System.out.println("Chrome");
                break;
                case "Firefox":
                    System.out.println("Firefox");
                    break;
                    case "Opera":
                        System.out.println("Opera");
                        break;
                        case "Safari":
                            System.out.println("Safari");
                            break;
                            default:
                                System.out.println("Unknown browser");
                                break;
        }
    }
}
