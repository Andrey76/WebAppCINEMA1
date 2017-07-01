package dao;

import dao.api.Dao;
import dao.impl.MovieDaoImpl;
import dao.impl.UserDAOImpl;
import helper.PropertyHolder;
import model.Movie;
import model.User;

/**
 * Created by andr_ on 18.05.2017.
 */
public class DAOFactory {
    private static DAOFactory instance = null;

    private Dao<Integer, Movie> movieDao;
    private Dao<Integer, User> userDao;
   // private Dao<Integer, AccessRight2> roleDao;

    private DAOFactory(){
        loadDaos();
    }



    public static DAOFactory getInstance(){
        if(instance == null){
            instance = new DAOFactory();
        }
        return instance;
    }

    private void loadDaos() {
        if(PropertyHolder.getInstance().isInMemoryDB()){
            //inmemory daos
        }else{
            //jdbc daos
            movieDao = MovieDaoImpl.getInstance();
            userDao = new UserDAOImpl();
         //   roleDao = new RoleDAOImpl();
        }
    }

    public Dao<Integer, Movie> getMovieDao() {
        return movieDao;
    }

    public void setMovieDao(Dao<Integer, Movie> movieDao) {
        this.movieDao = movieDao;
    }

    public static void setInstance(DAOFactory instance) {
        DAOFactory.instance = instance;
    }

    public Dao<Integer, User> getUserDao() {
        return userDao;
    }

    public void setUserDao(Dao<Integer, User> userDao) {
        this.userDao = userDao;
    }

 //   public Dao<Integer, Role> getRoleDao() {
  //      return roleDao;


    //public void setRoleDao(Dao<Integer, Role> roleDao) {
      //  this.roleDao = roleDao;
    }

