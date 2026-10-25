Function GUESSEDcreatebank_4#(arg0%)
    Local local0%
    Local local1#
    local0 = createbank($04)
    BASS_ChannelGetLevelEx(arg0, local0, 0.02, (((arg0 = T484F2XDF\Field8) Shl $04) + $01))
    local1 = peekfloat(local0, $00)
    freebank(local0)
    Return local1
    Return 0.0
End Function
