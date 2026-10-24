Function loadmaterials%(arg0$)
    Local local0$
    Local local1%
    Local local2$
    Local local3%
    catcherrors((("LoadMaterials(" + arg0) + ")"))
    local1 = $00
    local2 = ""
    local3 = openfile_strict(arg0)
    While (eof(local3) = $00)
        local0 = trim(readline(local3))
        If (left(local0, $01) = "[") Then
            local0 = mid(local0, $02, (len(local0) - $02))
            YX268F0226(arg0, local0)
        EndIf
    Wend
    closefile(local3)
    catcherrors((("Uncaught: LoadMaterials(" + arg0) + ")"))
    Return $00
End Function
