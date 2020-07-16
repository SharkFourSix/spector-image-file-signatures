package lib.gintec_rdl.spector.providers;

import lib.gintec_rdl.spector.FileSignature;
import lib.gintec_rdl.spector.FileSignatureProviderImpl;
import lib.gintec_rdl.spector.ResourceFileSignatureProvider;

import java.util.List;

public final class ImageFileSignatureProvider extends FileSignatureProviderImpl {
    private static final String NAME = "image-file-signature-provider";
    private final ResourceFileSignatureProvider delegateProvider;

    public ImageFileSignatureProvider() {
        delegateProvider = new ResourceFileSignatureProvider("spector/signatures/images/image-signatures.json");
    }

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public List<FileSignature> getSignatures() {
        return delegateProvider.getSignatures();
    }
}
