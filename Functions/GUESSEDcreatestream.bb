Function GUESSEDcreatestream%(arg0%, arg1%)
    Local local0%
    local0 = BASS_OPUS_StreamCreate(arg0, arg1, $FFFFFFFF, $00)
    freebank(arg0)
    arg0 = $00
    Return local0
    Return $00
End Function
