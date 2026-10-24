Function XZD4DX22ZD.TF2ZXX8FZ(arg0$, arg1#, arg2#, arg3%, arg4%, arg5%, arg6#, arg7#, arg8#)
    Local local0.TF2ZXX8FZ
    Local local1%
    local0 = (New TF2ZXX8FZ)
    local0\Field0 = local1
    local0\Field6 = createpivot($00)
    local0\Field2 = arg4
    local0\Field4 = arg3
    local0\Field9 = arg1
    local0\Field5 = arg2
    local0\Field7 = arg5
    local0\Field3 = $00
    local0\Field8 = TX4ZXB8XZ26(arg0, $00, -1.0)
    If (TXXF6F02DB2[arg5] = Null) Then
        positionentity(local0\Field6, arg6, arg7, arg8, $00)
    EndIf
    T4ZZZF8Z80(local0, $00, $01)
    If (isplayeroutsidefacility() = $00) Then
        ChannelReverb(local0\Field8)
    EndIf
    ResumeChannel(local0\Field8)
    Return local0
    Return Null
End Function
