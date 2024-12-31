package Lektion22.Ubung1;

public class YingYangThread extends Thread {
    private String msg;

    YingYangThread(String msg) {
        this.msg = msg;
    }
    @Override
    public void run() {
        while (true) {
            try {
                System.out.println(msg);
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
/*
class YinYangRunnable implements Runnable {
    private String message;

    public YinYangRunnable(String message) {
        this.message = message;
    }

    public void run() {
        while (true) {
            System.out.println(message);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Thread yin = new Thread(new YinYangRunnable("Yin"));
        Thread yang = new Thread(new YinYangRunnable("Yang"));

        yin.start();
        yang.start();
    }
}
public class Main {
    public static void main(String[] args) {
        Thread yin = new Thread(new Runnable() {
            public void run() {
                while (true) {
                    System.out.println("Yin");
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        Thread yang = new Thread(new Runnable() {
            public void run() {
                while (true) {
                    System.out.println("Yang");
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        yin.start();
        yang.start();
    }
}
public class Main {
    public static void main(String[] args) {
        class YinYangRunnable implements Runnable {
            private String message;

            public YinYangRunnable(String message) {
                this.message = message;
            }

            public void run() {
                while (true) {
                    System.out.println(message);
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }

        Thread yin = new Thread(new YinYangRunnable("Yin"));
        Thread yang = new Thread(new YinYangRunnable("Yang"));

        yin.start();
        yang.start();
    }
}

 */