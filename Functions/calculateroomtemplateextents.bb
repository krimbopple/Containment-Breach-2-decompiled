Function calculateroomtemplateextents%(arg0.roomtemplates)
    getmeshextents(getchild(arg0\Field0, $02), 1590.0)
    arg0\Field16 = mesh_minx
    arg0\Field29 = mesh_miny
    arg0\Field10 = mesh_minz
    arg0\Field26 = mesh_maxx
    arg0\Field19 = mesh_maxy
    arg0\Field31 = mesh_maxz
    arg0\Field24 = mesh_midx
    arg0\Field23 = mesh_midy
    arg0\Field4 = mesh_midz
    getmeshextents(getchild(arg0\Field0, $02), 100000000.0)
    arg0\Field27 = mesh_minx
    arg0\Field30 = mesh_miny
    arg0\Field18 = mesh_minz
    arg0\Field28 = mesh_maxx
    arg0\Field9 = mesh_maxy
    arg0\Field25 = mesh_maxz
    arg0\Field32 = mesh_midx
    arg0\Field2 = mesh_midy
    arg0\Field17 = mesh_midz
    Return $00
End Function
