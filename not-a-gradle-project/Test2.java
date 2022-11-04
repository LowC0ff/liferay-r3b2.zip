import com.liferay.headless.delivery.client.dto.v1_0.KnowledgeBaseFolder;
import com.liferay.headless.delivery.client.dto.v1_0.KnowledgeBaseArticle;
import com.liferay.headless.delivery.client.resource.v1_0.KnowledgeBaseArticleResource;
import com.liferay.headless.delivery.client.resource.v1_0.KnowledgeBaseFolderResource;


public class Test2 {

        public static void main(String[] args) throws Exception{

                KnowledgeBaseFolderResource.Builder CreateKBFolder = 
                KnowledgeBaseFolderResource.builder();
                KnowledgeBaseArticleResource.Builder CreateKBArticle = 
                KnowledgeBaseArticleResource.builder();

                KnowledgeBaseFolderResource kBFResource = 
                CreateKBFolder.authentication("test@liferay.com", "123").build();
                KnowledgeBaseArticleResource kBAResource = 
                CreateKBArticle.authentication("test@liferay.com", "123").build();


                KnowledgeBaseFolder kBFolderA, kBFolderB, getkBFolder, putkBFolder, delkBFolder, guardkBFolder;
                kBFolderA = null;
                kBFolderB = new KnowledgeBaseFolder();
                getkBFolder = new KnowledgeBaseFolder();
                putkBFolder = new KnowledgeBaseFolder();
                guardkBFolder = null;

                KnowledgeBaseArticle kBArticleA, kBArticleB, getkBArticle, putkBArticle, delkBArticle;
                kBArticleA = new KnowledgeBaseArticle();
                kBArticleB = new KnowledgeBaseArticle();
                getkBArticle = new KnowledgeBaseArticle();
                putkBArticle = new KnowledgeBaseArticle();


                if (kBFolderA == null ) {
                kBFolderA = new KnowledgeBaseFolder();
                kBFolderA.setName("estudo biblico");
                kBFolderA.setDescription("modulo 1");

                kBFolderA = kBFResource.postSiteKnowledgeBaseFolder(20121L, kBFolderA);
                kBFResource.deleteKnowledgeBaseFolder(kBFolderA.getId());


                }else {
                kBFolderA.setName("estudo biblico 1");
                kBFolderA.setDescription("modulo 2");

                kBFolderA = kBFResource.postSiteKnowledgeBaseFolder(20121L, kBFolderA);
                kBFolderB.setName("Profetas Menores");
                kBFolderB.setDescription("Oseias, Joel, Amos, Obadias, Jonas, Miqueias, Naum, Habacuquem Sofonias, Ageu, Zacarias, Malaquias.");

                kBFolderB = kBFResource.postKnowledgeBaseFolderKnowledgeBaseFolder(kBFolderA.getId(), kBFolderB);


                putkBFolder.setName("Estudos 1");
                putkBFolder.setDescription("Biblia");
                putkBFolder = kBFResource.putKnowledgeBaseFolder(kBFolderA.getId(), kBFolderA);

                getkBFolder.getId();
                getkBFolder = kBFResource.getKnowledgeBaseFolder(kBFolderA.getId());


                kBArticleA.setTitle("testando");
                kBArticleA.setDescription("testando");
                kBArticleA.setArticleBody("testando");
                kBArticleA = kBAResource.postSiteKnowledgeBaseArticle(20121L, kBArticleA);

                putkBArticle.setTitle("Estudos 5");
                putkBArticle.setDescription("Biblias");
                putkBArticle = kBAResource.putKnowledgeBaseArticle(kBArticleA.getId(), kBArticleA);

                getkBArticle.getId();
                getkBArticle = kBAResource.getKnowledgeBaseArticle(kBArticleA.getId());

                kBAResource.deleteKnowledgeBaseArticle(kBArticleA.getId());

            }

        }

    }