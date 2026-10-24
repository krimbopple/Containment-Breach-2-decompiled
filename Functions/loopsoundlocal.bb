Function loopsoundlocal%(arg0%, arg1%, arg2#, arg3%)
    Local local0%
    If (0.0 < arg2) Then
        local0 = $00
        If (ChannelPlaying(arg1) = $00) Then
            arg1 = playsound_strict(arg0, arg3, $01)
            local0 = $01
        EndIf
        channelvolumeex(arg1, ((((opt\Field59 * (Float arg3)) + (opt\Field13 * (Float (arg3 = $00)))) * arg2) * opt\Field2))
        If (local0 <> 0) Then
            ResumeChannel(arg1)
        EndIf
    Else
        ChannelVolume(arg1, 0.0)
    EndIf
    Return arg1
    Return $00
End Function
