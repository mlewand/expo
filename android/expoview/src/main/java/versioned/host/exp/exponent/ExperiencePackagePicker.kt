package versioned.host.exp.exponent

import expo.modules.application.ApplicationPackage
import expo.modules.av.AVModule
import expo.modules.av.AVPackage
import expo.modules.av.video.VideoViewModule
import expo.modules.backgroundfetch.BackgroundFetchPackage
import expo.modules.barcodescanner.BarCodeScannerModule
import expo.modules.barcodescanner.BarCodeScannerPackage
import expo.modules.battery.BatteryModule
import expo.modules.blur.BlurModule
import expo.modules.brightness.BrightnessModule
import expo.modules.calendar.CalendarPackage
import expo.modules.camera.CameraViewModule
import expo.modules.cellular.CellularModule
import expo.modules.clipboard.ClipboardModule
import expo.modules.constants.ConstantsModule
import expo.modules.constants.ConstantsPackage
import expo.modules.contacts.ContactsPackage
import expo.modules.core.interfaces.Package
import expo.modules.crypto.CryptoModule
import expo.modules.device.DeviceModule
import expo.modules.documentpicker.DocumentPickerModule
import expo.modules.easclient.EASClientModule
import expo.modules.print.PrintModule
import expo.modules.facedetector.FaceDetectorPackage
import expo.modules.filesystem.FileSystemModule
import expo.modules.filesystem.FileSystemPackage
import expo.modules.gl.GLObjectManagerModule
import expo.modules.gl.GLViewModule
import expo.modules.haptics.HapticsModule
import expo.modules.image.ExpoImageModule
import expo.modules.imageloader.ImageLoaderPackage
import expo.modules.imagemanipulator.ImageManipulatorModule
import expo.modules.imagepicker.ImagePickerModule
import expo.modules.intentlauncher.IntentLauncherModule
import expo.modules.keepawake.KeepAwakeModule
import expo.modules.keepawake.KeepAwakePackage
import expo.modules.kotlin.ModulesProvider
import expo.modules.kotlin.modules.Module
import expo.modules.lineargradient.LinearGradientModule
import expo.modules.localauthentication.LocalAuthenticationModule
import expo.modules.localization.LocalizationModule
import expo.modules.location.LocationPackage
import expo.modules.mailcomposer.MailComposerModule
import expo.modules.manifests.core.Manifest
import expo.modules.medialibrary.MediaLibraryModule
import expo.modules.navigationbar.NavigationBarPackage
import expo.modules.network.NetworkModule
import expo.modules.notifications.NotificationsPackage
import expo.modules.permissions.PermissionsPackage
import expo.modules.random.RandomModule
import expo.modules.screencapture.ScreenCaptureModule
import expo.modules.screenorientation.ScreenOrientationModule
import expo.modules.sensors.SensorsPackage
import expo.modules.sensors.modules.AccelerometerModule
import expo.modules.sensors.modules.BarometerModule
import expo.modules.sensors.modules.DeviceMotionModule
import expo.modules.sensors.modules.GyroscopeModule
import expo.modules.sensors.modules.LightSensorModule
import expo.modules.sensors.modules.MagnetometerModule
import expo.modules.sensors.modules.MagnetometerUncalibratedModule
import expo.modules.sensors.modules.PedometerModule
import expo.modules.sharing.SharingModule
import expo.modules.sms.SMSModule
import expo.modules.speech.SpeechModule
import expo.modules.splashscreen.SplashScreenModule
import expo.modules.splashscreen.SplashScreenPackage
import expo.modules.sqlite.SQLiteModule
import expo.modules.storereview.StoreReviewModule
import expo.modules.systemui.SystemUIModule
import expo.modules.systemui.SystemUIPackage
import expo.modules.taskManager.TaskManagerPackage
import expo.modules.updates.UpdatesPackage
import expo.modules.videothumbnails.VideoThumbnailsModule
import expo.modules.webbrowser.WebBrowserModule

object ExperiencePackagePicker : ModulesProvider {
  private val EXPO_MODULES_PACKAGES = listOf(
    AVPackage(),
    ApplicationPackage(),
    BackgroundFetchPackage(),
    BarCodeScannerPackage(),
    CalendarPackage(),
    ConstantsPackage(),
    ContactsPackage(),
    FaceDetectorPackage(),
    FileSystemPackage(),
    ImageLoaderPackage(),
    KeepAwakePackage(),
    LocationPackage(),
    NavigationBarPackage(),
    NotificationsPackage(),
    PermissionsPackage(),
    SensorsPackage(),
    SplashScreenPackage(),
    SystemUIPackage(),
    TaskManagerPackage(),
    UpdatesPackage(),
  )

  /**
   * Returns all available packages.
   */
  fun packages(): List<Package> {
    return EXPO_MODULES_PACKAGES
  }

  /**
   * Returns packages filtered based on the app's manifest.
   * For now, filtering is not applied but it is on the todo list.
   */
  fun packages(manifest: Manifest?): List<Package> {
    return EXPO_MODULES_PACKAGES
  }

  override fun getModulesList(): List<Class<out Module>> = listOf(
    AVModule::class.java,
    // Sensors
    AccelerometerModule::class.java,
    BarometerModule::class.java,
    GyroscopeModule::class.java,
    LightSensorModule::class.java,
    DeviceMotionModule::class.java,
    MagnetometerModule::class.java,
    MagnetometerUncalibratedModule::class.java,
    PedometerModule::class.java,
    // End of Sensors
    BatteryModule::class.java,
    BarCodeScannerModule::class.java,
    BlurModule::class.java,
    CameraViewModule::class.java,
    CellularModule::class.java,
    ClipboardModule::class.java,
    CryptoModule::class.java,
    ConstantsModule::class.java,
    DeviceModule::class.java,
    DocumentPickerModule::class.java,
    EASClientModule::class.java,
    FileSystemModule::class.java,
    PrintModule::class.java,
    GLViewModule::class.java,
    GLObjectManagerModule::class.java,
    HapticsModule::class.java,
    ImagePickerModule::class.java,
    ImageManipulatorModule::class.java,
    ExpoImageModule::class.java,
    IntentLauncherModule::class.java,
    KeepAwakeModule::class.java,
    LinearGradientModule::class.java,
    LocalAuthenticationModule::class.java,
    LocalizationModule::class.java,
    MailComposerModule::class.java,
    MediaLibraryModule::class.java,
    NetworkModule::class.java,
    RandomModule::class.java,
    ScreenCaptureModule::class.java,
    ScreenOrientationModule::class.java,
    // SecureStoreModule is not added here, instead it is added in ExpoModuleRegistryAdapter.kt,
    // because it needs access to scopedContext for Expo Go support
    SMSModule::class.java,
    SharingModule::class.java,
    SpeechModule::class.java,
    SplashScreenModule::class.java,
    StoreReviewModule::class.java,
    SQLiteModule::class.java,
    SystemUIModule::class.java,
    VideoThumbnailsModule::class.java,
    VideoViewModule::class.java,
    WebBrowserModule::class.java,
    BrightnessModule::class.java,
  )
}
