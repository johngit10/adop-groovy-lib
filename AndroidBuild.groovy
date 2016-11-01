public class AndroidBuild{

  def buildManager

  public AndroidBuild(buildManager){
    this.buildManager = buildManager
  }

  def run() {
    build.listener.logger.println("AndroidBuild test output");
  }
}