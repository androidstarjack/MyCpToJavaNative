LOCAL_PATH:= $(call my-dir)

include $(CLEAR_VARS)


LOCAL_MODULE:= serviceData
LOCAL_SRC_FILES:= serviceData.c
LOCAL_EXPORT_C_INCLUDES := $(LOCAL_PATH)

LOCAL_LDLIBS+= -llog
include $(BUILD_SHARED_LIBRARY)


