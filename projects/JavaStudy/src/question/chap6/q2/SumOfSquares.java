package question.chap6.q2;

public class SumOfSquares {

  int sumWhile(int N) {
    int i = 0;
    int result = 0;
    if (N > 0) {
      while (i <= N) {
        result = result + i * i;
        i++;
      }
    }
    return result;
  } // sumWhile

  int sumRecursive(int N) {
    if (N == 1) {
      return 1;
    }
    return sumRecursive(N-1) + N * N;
  }
}
