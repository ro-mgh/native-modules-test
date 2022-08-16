#import "RmTextModule.h"

#ifdef RCT_NEW_ARCH_ENABLED
#import "RNRmTextModuleSpec.h"
#endif

@implementation RmTextModule
RCT_EXPORT_MODULE()

RCT_REMAP_METHOD(changeText,
                 (NSString *) newText
                 myCallback:(RCTResponseSenderBlock)callback)
{
  callback(@[@(newText)])
}


// Don't compile this code when we build for the old architecture.
#ifdef RCT_NEW_ARCH_ENABLED
- (std::shared_ptr<facebook::react::TurboModule>)getTurboModule:
    (const facebook::react::ObjCTurboModule::InitParams &)params
{
    return std::make_shared<facebook::react::NativeRmTextModuleSpecJSI>(params);
}
#endif

@end
