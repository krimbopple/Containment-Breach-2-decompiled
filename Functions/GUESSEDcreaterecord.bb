Function GUESSEDcreaterecord%(arg0%, arg1%, arg2%, arg3%)
    Local local0%
    Local local1%
    Local local2%
    Local local3%
    If (T484F2XDF <> Null) Then
        Return $00
    EndIf
    opus_set_type(arg3)
    opus_set_channels($01)
    opus_set_sample_rate(arg1)
    opus_set_default_frame_size((Int ((Float opus_get_sample_rate()) * 0.06)))
    If (opus_get_new_encoder() = $00) Then
        Return $00
    EndIf
    _opus_encoder_ctl_bb(GUESSEDgetglobal_12(), $FA2, arg2)
    local0 = $00
    _opus_encoder_ctl_bb(GUESSEDgetglobal_12(), $FA3, local0)
    local1 = GUESSEDcreatebank_3()
    If (local1 = $00) Then
        Return $00
    EndIf
    local2 = $FFFFFFFF
    If (opt\Field24 <> "") Then
        For local3 = $00 To (local1 - $01) Step $01
            If (GUESSEDupdatemainmenu(local3) = opt\Field24) Then
                local2 = GUESSEDgetarray_4(local3)
                Exit
            EndIf
        Next
    EndIf
    If (BASS_RecordInit(local2) = $00) Then
        Return $00
    EndIf
    T484F2XDF = (New XDF6060F82)
    T484F2XDF\Field8 = BASS_RecordStart(opus_get_sample_rate(), opus_get_channels(), $00, $00, $00)
    T484F2XDF\Field0 = createbank((opus_get_default_frame_size() Shl $01))
    T484F2XDF\Field1 = createbank($00)
    BASS_ChannelSetAttribute(T484F2XDF\Field8, $08, 2.0)
    Return $00
End Function
