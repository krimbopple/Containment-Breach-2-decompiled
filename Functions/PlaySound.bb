Function PlaySound%(arg0%, arg1#)
    Local local0%
    local0 = BASS_SampleGetChannel(arg0, $40002)
    If (local0 <> $00) Then
        If (0.0 <= arg1) Then
            ChannelVolume(local0, arg1)
            ResumeChannel(local0)
        EndIf
    EndIf
    Return local0
    Return $00
End Function
