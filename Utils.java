class Utils {
    // Método de contagem regressiva reutilizável
    public static void countdown(int seconds) {
        for (int i = seconds; i >= 1; i--) {
            try {
                Thread.sleep(1000);
                System.out.println(i + "s");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
