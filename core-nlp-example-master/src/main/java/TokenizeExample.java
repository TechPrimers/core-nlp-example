

import edu.stanford.nlp.ling.CoreLabel;
import edu.stanford.nlp.pipeline.CoreDocument;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;

import java.util.List;

public class TokenizeExample
{

    public static void main(String[] args) 
     {

        StanfordCoreNLP stanfordCoreNLP = Pipeline.getPipeline();

        String text = "Hey! This is Dinecvgdsh Krishnan";

        CoreDocument coreDocument = new CoreDocument(text);

        stanfordCoreNLP.annotate(coreDocument);

        List<CoreLabel> coreLabelList = coreDocument.tokens();

        for(CoreLabel coreLabel : coreLabelList) {

            System.out.println(coreLabel.originalText());
        }

    }
}
