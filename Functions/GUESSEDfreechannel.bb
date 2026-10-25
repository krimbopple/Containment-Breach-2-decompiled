Function GUESSEDfreechannel%()
    Local local0%
    If (T484F2XDF = Null) Then
        Return $00
    EndIf
    BASS_ChannelStop(T484F2XDF\Field8)
    freebank(T484F2XDF\Field1)
    T484F2XDF\Field1 = $00
    freebank(T484F2XDF\Field0)
    T484F2XDF\Field0 = $00
    opus_remove_encoder()
    BASS_RecordFree()
    Delete T484F2XDF
    Return $00
End Function
