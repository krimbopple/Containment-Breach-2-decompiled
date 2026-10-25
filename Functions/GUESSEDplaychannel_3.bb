Function GUESSEDplaychannel_3.TF2ZXX8FZ(arg0%, arg1#, arg2#, arg3%, arg4%, arg5%, arg6%, arg7#, arg8#, arg9#)
    Local local0.TF2ZXX8FZ
    If (arg0 = $00) Then
        Return Null
    EndIf
    local0 = (New TF2ZXX8FZ)
    local0\Field0 = arg0
    local0\Field6 = createpivot($00)
    local0\Field2 = arg4
    local0\Field4 = arg3
    local0\Field9 = arg1
    local0\Field5 = arg2
    local0\Field7 = arg6
    local0\Field3 = (arg5 = $00)
    local0\Field8 = PlaySound(GUESSEDgetarg0_6((Object.X2B8DB2B8X local0\Field0)), -1.0)
    If (TXXF6F02DB2[arg6] = Null) Then
        positionentity(local0\Field6, arg7, arg8, arg9, $00)
    EndIf
    GUESSEDplaychannel(local0, $00, $01)
    If (isplayeroutsidefacility() = $00) Then
        ChannelReverb(local0\Field8)
    EndIf
    ResumeChannel(local0\Field8)
    Return local0
    Return Null
End Function
