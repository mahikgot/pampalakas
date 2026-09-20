class calculateScore {
  public static void main(String[] args) {

  }

  public long calculateScore(String[] instructions, int[] values) {
    boolean[] visited = new boolean[instructions.length];
    long scr = 0;
    for (int i = 0; i>=0 && i < instructions.length && !visited[i];) {
      System.out.println(instructions[i]);
      if (instructions[i].equals("add")) {
        scr += values[i];
        visited[i] = true; //BOBO
        i++;
      } else {
        visited[i] = true; //BOBO
        i = i + values[i];
      }
      
    }

    return scr;
  }
}
