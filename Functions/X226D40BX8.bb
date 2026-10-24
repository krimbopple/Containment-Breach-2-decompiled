Function X226D40BX8%(arg0$)
    Local local0$
    Local local1%
    Local local2$
    Local local3%
    catcherrors((("LoadPropsSettings(" + arg0) + ")"))
    If (XD688B202 <> Null) Then
        Delete XD688B202
    EndIf
    XD688B202 = (New T82BBBXXXD)
    XD688B202\Field0 = 1.0
    XD688B202\Field5 = 0.1
    XD688B202\Field6 = 0.1
    XD688B202\Field4 = 0.5
    XD688B202\Field1 = 0.0
    XD688B202\Field2 = 1.0
    XD688B202\Field3 = "box"
    local1 = $00
    local2 = ""
    local3 = openfile_strict(arg0)
    While (eof(local3) = $00)
        local0 = trim(readline(local3))
        If (left(local0, $01) = "[") Then
            local0 = mid(local0, $02, (len(local0) - $02))
            Y0BF040FXZ(arg0, local0)
        EndIf
    Wend
    closefile(local3)
    catcherrors((("Uncaught: LoadPropsSettings(" + arg0) + ")"))
    Return $00
End Function
