package JC_1.Worker;

@FunctionalInterface
public interface OnTaskErrorListener {
    void onError(String error);
}
