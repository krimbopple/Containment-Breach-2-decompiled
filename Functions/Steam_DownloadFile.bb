Function Steam_DownloadFile.TXB0X08F8BX(arg0$, arg1$, arg2%, arg3%)
    Local local0%
    Local local1$
    Local local2.TXB0X08F8BX
    Local local3%
    If (XD82FXFXF4 = $00) Then
        Return Null
    EndIf
    local1 = _Steam_DownloadFile(arg0, local0, $00)
    If (local1 = "") Then
        Return Null
    EndIf
    CreateDirectories(stripfilename(arg1))
    local2 = (New TXB0X08F8BX)
    local2\Field7 = arg1
    local2\Field1 = arg2
    local2\Field12 = local0
    local2\Field5 = $01
    local2\Field4 = $00
    local2\Field9 = arg0
    If (arg1 <> "") Then
        local2\Field2 = writefile(arg1)
        If (local2\Field2 = $00) Then
            GUESSEDsetfield_16(local2)
            Return Null
        EndIf
    Else
        local2\Field11 = createbank($00)
    EndIf
    _Steam_RegisterCallResult(FuncPtr(X8668X86BB), $835, local1)
    If (arg3 > $00) Then
        local3 = (millisecs() + arg3)
        local2\Field6 = $01
        While (((local2\Field6 <> $FFFFFFFF) And (local3 > millisecs())) <> 0)
            _Steam_Update()
            delay($0A)
        Wend
        local2\Field6 = $00
        If (local3 < millisecs()) Then
            GUESSEDsetfield_16(local2)
        EndIf
    EndIf
    Return local2
    Return Null
End Function
