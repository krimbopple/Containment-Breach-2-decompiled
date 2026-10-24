Function XF8BD48Z24%(arg0$)
    If ((((((arg0 = "") Lor instr(arg0, "..", $01)) Lor instr(arg0, "%", $01)) Lor instr(arg0, "&", $01)) Lor instr(arg0, "?", $01)) <> 0) Then
        Return $00
    EndIf
    Select trim(fileextension(arg0))
        Case "exe","dll","vbs","vbe","wsf","ws","bat","cmd","chm","com","out","paf"
            Return $00
        Case "pex","ps1","run","prg","cmd","pif","rtf","pdf","msc","msp","jar","js"
            Return $00
        Case "jse","scf","lnk","inf","reg","doc","xls","ppt","docm","dotm","xlsm"
            Return $00
        Case "xltm","xlam","pptm","potm","ppam","ppsm","sldm","wsc","wsh","vb"
            Return $00
    End Select
    Return $01
    Return $00
End Function
