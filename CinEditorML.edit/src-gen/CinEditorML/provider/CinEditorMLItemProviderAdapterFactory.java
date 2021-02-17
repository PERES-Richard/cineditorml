/**
 */
package CinEditorML.provider;

import CinEditorML.util.CinEditorMLAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CinEditorMLItemProviderAdapterFactory extends CinEditorMLAdapterFactory
		implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CinEditorMLItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link CinEditorML.Movie} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MovieItemProvider movieItemProvider;

	/**
	 * This creates an adapter for a {@link CinEditorML.Movie}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMovieAdapter() {
		if (movieItemProvider == null) {
			movieItemProvider = new MovieItemProvider(this);
		}

		return movieItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link CinEditorML.Layer} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LayerItemProvider layerItemProvider;

	/**
	 * This creates an adapter for a {@link CinEditorML.Layer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLayerAdapter() {
		if (layerItemProvider == null) {
			layerItemProvider = new LayerItemProvider(this);
		}

		return layerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link CinEditorML.Text} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TextItemProvider textItemProvider;

	/**
	 * This creates an adapter for a {@link CinEditorML.Text}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTextAdapter() {
		if (textItemProvider == null) {
			textItemProvider = new TextItemProvider(this);
		}

		return textItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link CinEditorML.Picture} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PictureItemProvider pictureItemProvider;

	/**
	 * This creates an adapter for a {@link CinEditorML.Picture}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPictureAdapter() {
		if (pictureItemProvider == null) {
			pictureItemProvider = new PictureItemProvider(this);
		}

		return pictureItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link CinEditorML.Video} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VideoItemProvider videoItemProvider;

	/**
	 * This creates an adapter for a {@link CinEditorML.Video}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createVideoAdapter() {
		if (videoItemProvider == null) {
			videoItemProvider = new VideoItemProvider(this);
		}

		return videoItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link CinEditorML.FadeIn} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FadeInItemProvider fadeInItemProvider;

	/**
	 * This creates an adapter for a {@link CinEditorML.FadeIn}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFadeInAdapter() {
		if (fadeInItemProvider == null) {
			fadeInItemProvider = new FadeInItemProvider(this);
		}

		return fadeInItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link CinEditorML.FadeOut} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FadeOutItemProvider fadeOutItemProvider;

	/**
	 * This creates an adapter for a {@link CinEditorML.FadeOut}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFadeOutAdapter() {
		if (fadeOutItemProvider == null) {
			fadeOutItemProvider = new FadeOutItemProvider(this);
		}

		return fadeOutItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link CinEditorML.Translate} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TranslateItemProvider translateItemProvider;

	/**
	 * This creates an adapter for a {@link CinEditorML.Translate}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTranslateAdapter() {
		if (translateItemProvider == null) {
			translateItemProvider = new TranslateItemProvider(this);
		}

		return translateItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link CinEditorML.Position} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PositionItemProvider positionItemProvider;

	/**
	 * This creates an adapter for a {@link CinEditorML.Position}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPositionAdapter() {
		if (positionItemProvider == null) {
			positionItemProvider = new PositionItemProvider(this);
		}

		return positionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link CinEditorML.Rectangle} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RectangleItemProvider rectangleItemProvider;

	/**
	 * This creates an adapter for a {@link CinEditorML.Rectangle}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRectangleAdapter() {
		if (rectangleItemProvider == null) {
			rectangleItemProvider = new RectangleItemProvider(this);
		}

		return rectangleItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link CinEditorML.Dimension} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DimensionItemProvider dimensionItemProvider;

	/**
	 * This creates an adapter for a {@link CinEditorML.Dimension}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDimensionAdapter() {
		if (dimensionItemProvider == null) {
			dimensionItemProvider = new DimensionItemProvider(this);
		}

		return dimensionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link CinEditorML.HexadecimalColor} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HexadecimalColorItemProvider hexadecimalColorItemProvider;

	/**
	 * This creates an adapter for a {@link CinEditorML.HexadecimalColor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createHexadecimalColorAdapter() {
		if (hexadecimalColorItemProvider == null) {
			hexadecimalColorItemProvider = new HexadecimalColorItemProvider(this);
		}

		return hexadecimalColorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link CinEditorML.GraphicalElement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GraphicalElementItemProvider graphicalElementItemProvider;

	/**
	 * This creates an adapter for a {@link CinEditorML.GraphicalElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGraphicalElementAdapter() {
		if (graphicalElementItemProvider == null) {
			graphicalElementItemProvider = new GraphicalElementItemProvider(this);
		}

		return graphicalElementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link CinEditorML.ItemPositionInt} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ItemPositionIntItemProvider itemPositionIntItemProvider;

	/**
	 * This creates an adapter for a {@link CinEditorML.ItemPositionInt}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createItemPositionIntAdapter() {
		if (itemPositionIntItemProvider == null) {
			itemPositionIntItemProvider = new ItemPositionIntItemProvider(this);
		}

		return itemPositionIntItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link CinEditorML.ItemPositionString} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ItemPositionStringItemProvider itemPositionStringItemProvider;

	/**
	 * This creates an adapter for a {@link CinEditorML.ItemPositionString}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createItemPositionStringAdapter() {
		if (itemPositionStringItemProvider == null) {
			itemPositionStringItemProvider = new ItemPositionStringItemProvider(this);
		}

		return itemPositionStringItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link CinEditorML.AudioElement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AudioElementItemProvider audioElementItemProvider;

	/**
	 * This creates an adapter for a {@link CinEditorML.AudioElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAudioElementAdapter() {
		if (audioElementItemProvider == null) {
			audioElementItemProvider = new AudioElementItemProvider(this);
		}

		return audioElementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link CinEditorML.Margin} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MarginItemProvider marginItemProvider;

	/**
	 * This creates an adapter for a {@link CinEditorML.Margin}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMarginAdapter() {
		if (marginItemProvider == null) {
			marginItemProvider = new MarginItemProvider(this);
		}

		return marginItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link CinEditorML.TemporalPosition} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TemporalPositionItemProvider temporalPositionItemProvider;

	/**
	 * This creates an adapter for a {@link CinEditorML.TemporalPosition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTemporalPositionAdapter() {
		if (temporalPositionItemProvider == null) {
			temporalPositionItemProvider = new TemporalPositionItemProvider(this);
		}

		return temporalPositionItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>) type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (movieItemProvider != null)
			movieItemProvider.dispose();
		if (layerItemProvider != null)
			layerItemProvider.dispose();
		if (textItemProvider != null)
			textItemProvider.dispose();
		if (pictureItemProvider != null)
			pictureItemProvider.dispose();
		if (videoItemProvider != null)
			videoItemProvider.dispose();
		if (fadeInItemProvider != null)
			fadeInItemProvider.dispose();
		if (fadeOutItemProvider != null)
			fadeOutItemProvider.dispose();
		if (translateItemProvider != null)
			translateItemProvider.dispose();
		if (positionItemProvider != null)
			positionItemProvider.dispose();
		if (rectangleItemProvider != null)
			rectangleItemProvider.dispose();
		if (dimensionItemProvider != null)
			dimensionItemProvider.dispose();
		if (hexadecimalColorItemProvider != null)
			hexadecimalColorItemProvider.dispose();
		if (graphicalElementItemProvider != null)
			graphicalElementItemProvider.dispose();
		if (itemPositionIntItemProvider != null)
			itemPositionIntItemProvider.dispose();
		if (itemPositionStringItemProvider != null)
			itemPositionStringItemProvider.dispose();
		if (audioElementItemProvider != null)
			audioElementItemProvider.dispose();
		if (marginItemProvider != null)
			marginItemProvider.dispose();
		if (temporalPositionItemProvider != null)
			temporalPositionItemProvider.dispose();
	}

}
