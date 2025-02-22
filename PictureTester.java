/**
 * This class contains class (static) methods that will help you test the
 * Picture class methods. Uncomment the methods and the code in the main to
 * test.
 *
 * @author Barbara Ericson
 */
public class PictureTester {

    /**
     * Method to test the PictureExplorer
     */
    // Belgium by them Snapshots on Unsplash.
    public static void testExplorer() {
        Picture belgium = new Picture("Belgium.jpg");   
        Picture posterBelgium = belgium.scale(0.25, 0.25);
        posterBelgium.explore();
        posterBelgium.write("posterBelgium.jpg");
    }

    
    /**
     * Method to test zeroBlue
     */
    public static void testZeroBlue() {
        Picture beach = new Picture("beach.jpg");
        beach.explore();
        beach.zeroBlue();
        beach.explore();
    }

    public static void keepOnlyBlueTest() {
        Picture beach = new Picture("beach.jpg");
        beach.explore();
        beach.keepOnlyBlue();
        beach.explore();
    }

    public static void testKeepOnlyRed() {
        Picture swan = new Picture("swan.jpg");
        swan.explore();
        swan.keepOnlyRed();
        swan.explore();
    }

    public static void testKeepOnlyGreen() {
        Picture shatner = new Picture("shatner.jpg");
        shatner.explore();
        shatner.keepOnlyGreen();
        shatner.explore();
    }

    public static void testNegate() {
        Picture jenny = new Picture("jenny-red.jpg");
        jenny.explore();
        jenny.negate();
        jenny.explore();
    }

    public static void testGrayscale() {
        Picture belgium = new Picture("Belgium.jpg");
        belgium.explore();
        belgium.grayscale();
        belgium.explore();
    }

    public static void testFixUnderwater() {
        Picture water = new Picture("water.jpg");
        water.explore();
       // water.FixUnderwater();
        water.explore();
    }
    

    /**
     * Method to test mirrorVertical
     */
    public static void testMirrorVertical() {
        Picture caterpillar = new Picture("swan.jpg");
        caterpillar.explore();
        caterpillar.mirrorVertical();
        caterpillar.explore();
    }

    public static void testmirrorVerticalRightToLeft()
    {
        Picture swan= new Picture("swan.jpg");
        swan.explore();
        swan.mirrorVerticalRightToLeft();
        swan.explore();
    }

    public static void testmirrorHorizontal()
    {
        Picture swan= new Picture("swan.jpg");
        swan.explore();
        swan.mirrorHorizontal();
        swan.explore();
    }

    public static void testMirrorToptoBottom()
    {
        Picture swan= new Picture("swan.jpg");
        swan.explore();
        swan.MirrorToptoBottom();
        swan.explore();
    }

   
    /**
     * Method to test mirrorTemple
     */
    public static void testMirrorTemple() {
        Picture temple = new Picture("temple.jpg");
        temple.explore();
        temple.mirrorTemple();
        temple.explore();
    }

    /**
     * Method to test edgeDetection
     */
    public static void testEdgeDetection() {
        Picture swan = new Picture("swan.jpg");
        swan.edgeDetection(10);
        swan.explore();
    }

    /**
     * Method to test scaling a picture
     */
    public static void testScale() {
        Picture temple = new Picture("temple.jpg");
        temple.explore();
        Picture temple2 = temple.scale(0.5, 0.5);
        temple2.explore();
    }

    /**
     * Main method for testing. Every class can have a main method in Java
     */
    public static void main(String[] args) {
        // uncomment a call here to run a test
        // and comment out the ones you don't want
        // to run

       // testExplorer();
        //testScale();
        //testZeroBlue();
        //keepOnlyBlueTest();
        //testKeepOnlyRed();
        //testKeepOnlyGreen();
        //testNegate();
        // testGrayscale();
       // testmirrorVerticalRightToLeft();
        //testFixUnderwater();
       // testMirrorVertical();
        //testMirrorTemple();
        //testMirrorArms();
        //testMirrorGull();
        //testMirrorDiagonal();
        //testCollage();
        //testCopy();
        //testEdgeDetection();
        //testEdgeDetection2();
        //testChromakey();
        //testEncodeAndDecode();
        //testGetCountRedOverValue(250);
        //testSetRedToHalfValueInTopHalf();
        //testClearBlueOverValue(200);
        //testGetAverageForColumn(0);
        testmirrorHorizontal();
        testMirrorToptoBottom();
    }
}
