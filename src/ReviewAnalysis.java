import java.util.ArrayList;

public class ReviewAnalysis {
    private Review[] allReviews;

    // CODE ADDED TO ENABLE TESTING; IMPLEMENTATION NOT SHOWN IN ORIGINAL FRQ
    public ReviewAnalysis(Review[] reviews) {
        allReviews = reviews;
    }

    public double getAverageRating() {
        // TYPE UP YOUR PART A CODE HERE
        // then test with ReviewTester

        int sum=0;
        for (Review r: allReviews) {
            sum += r.getRating();
        }

        return sum/((double) allReviews.length);
    }

    public ArrayList<String> collectComments() {
        // TYPE UP YOUR PART B CODE HERE
        // then test with ReviewTester

        ArrayList<String> comments= new ArrayList<>();

        for (int i=0;i<allReviews.length;i++){
            Review r = allReviews[i];
            String text=r.getComment();
            if(text.indexOf("!")!=-1){
                String last=text.substring(text.length()-1);
                if(!(last.equals("." ) || last.equals("!"))){
                    text += ".";
                }

                comments.add(i+"-"+text);
            }
        }
        return comments;
    }
}
