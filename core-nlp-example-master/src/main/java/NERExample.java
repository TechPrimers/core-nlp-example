

import edu.stanford.nlp.ling.CoreAnnotations;
import edu.stanford.nlp.ling.CoreLabel;
import edu.stanford.nlp.pipeline.CoreDocument;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;

import java.util.List;

public class NERExample {

    public static void main(String[] args)
    {

        StanfordCoreNLP stanfordCoreNLP = Pipeline.getPipeline();

        String text = "Hey! My  name is  Krishnan and I have friend his name is Robert." +
                " We both are living in Berlin";

        CoreDocument coreDocument = new CoreDocument(text);

        stanfordCoreNLP.annotate(coreDocument);

        List<CoreLabel> coreLabels = coreDocument.tokens();

        for(CoreLabel coreLabel : coreLabels) {

            String ner = coreLabel.get(CoreAnnotations.NamedEntityTagAnnotation.class);

            System.out.println(coreLabel.originalText() + " = "+ ner);
        }

        /*  List nameList = coreLabels
                .stream()
                .filter(coreLabel -> "Person".equalsIgnoreCase(coreLabel.get(CoreAnnotations.NamedEntityTagAnnotation.class)))
                .collect(Collectors.toList());

        System.out.println(nameList);
             */
}
}
