Function GUESSEDsetrecord%()
    Local local0%
    Local local1%
    Local local2%
    If (T484F2XDF = Null) Then
        Return $00
    EndIf
    BASS_RecordFree()
    local0 = GUESSEDcreatebank_3()
    If (local0 = $00) Then
        GUESSEDfreechannel()
        Return $00
    EndIf
    local1 = $FFFFFFFF
    If (opt\Field24 <> "") Then
        For local2 = $00 To (local0 - $01) Step $01
            If (GUESSEDupdatemainmenu(local2) = opt\Field24) Then
                local1 = GUESSEDgetarray_4(local2)
                Exit
            EndIf
        Next
    EndIf
    If (BASS_RecordInit(local1) = $00) Then
        GUESSEDfreechannel()
        Return $00
    EndIf
    T484F2XDF\Field8 = BASS_RecordStart(opus_get_sample_rate(), opus_get_channels(), $00, $00, $00)
    BASS_ChannelSetAttribute(T484F2XDF\Field8, $08, 2.0)
    Return $00
End Function
