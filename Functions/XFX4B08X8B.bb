Function XFX4B08X8B%(arg0%, arg1%)
    Local local0%
    local0 = playsound_strict(arg0, $00, $00)
    ChannelPan(local0, 0.3)
    channelvolumeex(local0, ((((opt\Field59 * (Float arg1)) + (opt\Field13 * (Float (arg1 = $00)))) * 0.8) * opt\Field2))
    Return local0
    Return $00
End Function
